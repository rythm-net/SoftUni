function sortArray(array) {
    array.sort(twoCriteriaSort);
    array.forEach((el) => console.log(el));

    function twoCriteriaSort(cur, next) {
        if (cur.length === next.length) {
            return cur.localeCompare(next);
        }
        return cur.length - next.length;
    }
}
//sortArray(["alpha", "beta", "gamma"]);
sortArray(["Isacc", "Theodor", "Jack", "Harrison", "George"]);