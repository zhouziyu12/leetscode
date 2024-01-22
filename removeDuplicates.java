public int removeDuplicates(int[] A) {

    if (A == null || A.length == 0)
        return 0;
    int left = 0;
    for (int right = 1; right < A.length; right++) {
        if (A[left] != A[right])
            A[++left] = A[right];
    return ++left;
}}
