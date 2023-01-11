using System;
using System.Collections.Generic;

namespace _03._Min_Heap
{
    public class PriorityQueue<T> : MinHeap<T> where T : IComparable<T>
    {
        private Dictionary<T, int> indexesByKey;

        public PriorityQueue()
        {
            this.indexesByKey = new Dictionary<T, int>();
            this.elements = new List<T>();
        }

        public int Count => this.elements.Count;

        public void Enqueue(T element)
        {
            this.elements.Add(element);
            this.indexesByKey.Add(element, this.Count - 1);
            this.HeapifyUp(this.Count - 1);
        }

        public T Dequeue()
        {
            this.ValidateIfEmpty();

            T firstElement = this.elements[0];

            this.Swap(0, this.Count - 1);

            this.elements.RemoveAt(this.Count - 1);
            this.indexesByKey.Remove(firstElement);

            this.HeapifyDown(0);

            return firstElement;
        }

        private void HeapifyDown(int index)
        {
            var smallerChildIndex = this.GetSmallerChildIndex(index);

            while (IsIndexValid(smallerChildIndex) && this.IsGreater(index, smallerChildIndex))
            {
                this.Swap(smallerChildIndex, index);

                index = smallerChildIndex;
                smallerChildIndex = this.GetSmallerChildIndex(index);
            }
        }

        private void HeapifyUp(int index)
        {
            int parentIndex = (index - 1) / 2;
            while (index > 0 && IsGreater(parentIndex, index))
            {
                this.Swap(index, parentIndex);
                index = parentIndex;
                parentIndex = (index - 1) / 2;
            }
        }

        private new void Swap(int index, int parentIndex)
        {
            var temp = this.elements[index];
            this.elements[index] = this.elements[parentIndex];
            this.elements[parentIndex] = temp;

            this.indexesByKey[this.elements[parentIndex]] = parentIndex;
            this.indexesByKey[this.elements[index]] = index;
        }

        public void DecreaseKey(T key)
        {
            // This solution -> ( this.elements.FindIndex(x => x.Equals(key)); ) is not optimal.
            // By keeping a map of all indexes we achieve O(logN) complexity. 
            this.HeapifyUp(this.indexesByKey[key]);
        }
    }
}
