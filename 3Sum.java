public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
         // Start typing your Java solution below
         // DO NOT write main() function
         ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
         qsort(num, 0, num.length - 1);
      for (int i = 0; i < num.length - 2; i++)
      {
        if (i > 0 && num[i] == num[i - 1])
          continue;
        
        twoSum(num, -num[i], i + 1, num.length - 1, result);
      }
    return result;       
     }

     private void twoSum(int[] num, int target, int start, int end, ArrayList<ArrayList<Integer>> result)
     {
         while (start < end)
      {         
        if (num[start] + num[end] == target)
        {
          ArrayList<Integer> list = new ArrayList<Integer>();
          list.add(-target);
          list.add(num[start]);
          list.add(num[end]);
          result.add(list);
          start++;
          while (start < end && num[start] == num[start - 1])
            start++;
        }
        else if (num[start] + num[end] > target)
        {
          end--;
          while (start < end && num[end] == num[end + 1])
            end--;
        }
        else
        { 
          start++;
          while (start < end && num[start] == num[start - 1])
            start++;
        }
      }
     }

     private void swap(int a[], int i,int j)
      {
      int tmp = a[i];
      a[i] = a[j];
      a[j] = tmp;
      }
    
      private int partition(int a[], int p, int r)
      {
        int point = a[r];
      int index = p;
      for (int i = index; i < r; ++ i) 
      {
            if (a[i] - point <= 0) 
            {
                swap(a, index++, i);
            }
        }
        swap(a, index, r);
        return index;
    }
    
    public void qsort(int a[], int p, int r)
    {
      if(p < r)
      {
          int q = partition(a, p, r);
          qsort(a, p, q-1);
          qsort(a, q+1, r);
      }
    }