namespace _02._Lowest_Common_Ancestor
{
    using System;
    using System.Collections.Generic;

    public class BinaryTree<T> : IAbstractBinaryTree<T>
        where T : IComparable<T>
    {
        public BinaryTree(
            T value,
            BinaryTree<T> leftChild,
            BinaryTree<T> rightChild)
        {
            this.Value = value;
            this.LeftChild = leftChild;
            this.RightChild = rightChild;
            if (leftChild != null)
            {
                this.LeftChild.Parent = this;
            }

            if (rightChild != null)
            {
                this.RightChild.Parent = this;
            }
        }

        public T Value { get; set; }

        public BinaryTree<T> LeftChild { get; set; }

        public BinaryTree<T> RightChild { get; set; }

        public BinaryTree<T> Parent { get; set; }

        public T FindLowestCommonAncestor(T first, T second)
        {
            var firstNode = this.FindNodeBfs(first, this);
            var secondNode = this.FindNodeBfs(second, this);

            if(firstNode == null || secondNode == null)
            {
                throw new InvalidOperationException();
            }

            var firstNodeAncestors = this.FindNodeAllAncestors(firstNode);
            var secondNodeAncestors = this.FindNodeAllAncestors(secondNode);

            var currentEl = firstNodeAncestors.Dequeue();

            while (firstNodeAncestors.Count > 0)
            {
                if (secondNodeAncestors.Contains(currentEl))
                {
                    return currentEl;
                }

                currentEl = firstNodeAncestors.Dequeue();
            }

            return currentEl;
        }

        private Queue<T> FindNodeAllAncestors(IAbstractBinaryTree<T> node)
        {
            var nodeAncestors = new Queue<T>();
            var current = node;

            while (current != null)
            {
                nodeAncestors.Enqueue(current.Value);
                current = current.Parent;
            }

            return nodeAncestors;
        }

        private IAbstractBinaryTree<T> FindNodeBfs(T element, IAbstractBinaryTree<T> tree)
        {
            var queue = new Queue<IAbstractBinaryTree<T>>();

            queue.Enqueue(tree);

            while (queue.Count > 0)
            {
                var current = queue.Dequeue();

                if (this.AreEqual(element, current.Value))
                {
                    return current;
                }

                if (current.LeftChild != null)
                {
                    queue.Enqueue(current.LeftChild);
                }

                if (current.RightChild != null)
                {
                    queue.Enqueue(current.RightChild);
                }
            }

            return null;
        }

        private bool AreEqual(T first, T second)
        {
            return first.CompareTo(second) == 0;
        }
    }
}