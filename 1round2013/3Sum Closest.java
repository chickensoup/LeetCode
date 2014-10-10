// 3Sum Closest
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        qsort(num, 0, num.length - 1);
        Closest min = new Closest(num[0] + num[1] + num[2], Math.abs(num[0]
                + num[1] + num[2] - target));

        for (int i = 0; i < num.length - 2; i++) {
            twoSumClosest(num, i, i + 1, num.length - 1, target, min);
        }

        return min.sum;

    }

    private void twoSumClosest(int[] num, int index, int start, int end, int target,
            Closest min) {
        while (start < end) {
            int sum = num[index] + num[start] + num[end];
            int ret = Math.abs(sum - target);
            if (ret < min.val)
            {
                min.sum = sum;
                min.val = ret;
            }
            
            if (ret == 0)
                return;
            
            if (sum > target)
                end--;
            else
                start++;
        }
    }

    class Closest {
        int val;
        int sum;

        public Closest(int sum, int val) {
            this.val = val;
            this.sum = sum;
        }
    }
    
    private void swap(int a[], int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private int partition(int a[], int p, int r) {
        int point = a[r];
        int index = p;
        for (int i = index; i < r; ++i) {
            if (a[i] - point <= 0) {
                swap(a, index++, i);
            }
        }
        swap(a, index, r);
        return index;
    }

    public void qsort(int a[], int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            qsort(a, p, q - 1);
            qsort(a, q + 1, r);
        }
    }