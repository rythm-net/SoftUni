namespace _02._Binary_Search_Tree
{
    using System;

    public interface IBinarySearchTree<T> where T : IComparable<T>
    {
        void Insert(T element);
        bool Contains(T element);
        void EachInOrder(Action<T> action);
        IBinarySearchTree<T> Search(T element);
    }
}