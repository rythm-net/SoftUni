using System;
using System.Collections.Generic;
using System.Text;

namespace _03._Min_Heap
{
    public class MinHeap<T> : IAbstractHeap<T>
        where T : IComparable<T>
    {
        protected List<T> elements;

        public MinHeap()
        {
            this.elements = new List<T>();
        }

        public int Size => this.elements.Count;


        public void Add(T element)
        {
            this.elements.Add(element);
            this.HeapifyUp(this.Size - 1);
        }

        public T ExtractMin()
        {
            this.ValidateIfEmpty();

            T firstElement = this.elements[0];

            this.Swap(0, this.Size - 1);

            this.elements.RemoveAt(this.Size - 1);

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

        protected bool IsIndexValid(int index)
        {
            return index >= 0 && index < this.elements.Count;
        }

        protected int GetSmallerChildIndex(int index)
        {
            var firstChildIndex = index * 2 + 1;
            var secondChildIndex = index * 2 + 2;

            if (secondChildIndex < this.elements.Count)
            {
                if (this.IsGreater(secondChildIndex, firstChildIndex))
                {
                    return firstChildIndex;
                }

                return secondChildIndex;
            }
            else if (firstChildIndex < this.elements.Count)
            {
                return firstChildIndex;
            }
            else
            {
                return -1;
            }
        }

        protected bool IsGreater(int index, int parentIndex)
        {
            return this.elements[index]
                .CompareTo(this.elements[parentIndex]) > 0;
        }

        protected void ValidateIfEmpty()
        {
            if (this.Size == 0)
            {
                throw new InvalidOperationException();
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

        protected void Swap(int index, int parentIndex)
        {
            var temp = this.elements[index];
            this.elements[index] = this.elements[parentIndex];
            this.elements[parentIndex] = temp;
        }

        public T Peek()
        {
            this.ValidateIfEmpty();
            return this.elements[0];
        }
    }
}
