/*
 * date: 01 - 03 - 2025
 * category: two pointers, binear search, brute force
 * complexity: O(n * log(n))
 */

#include <bits/stdc++.h>
using namespace std;

bool twoSum_brute_force(int *arr, int sz, int target) // O(n^2)
{
  for (int i = 0; i < sz - 1; i++)
  {
    for (int j = i + 1; j < sz; j++)
    {
      if (arr[i] + arr[j] == target)
        return true;
    }
  }

  return false;
}

bool twoSum_binary_search(int *arr, int sz, int target) // O(n*Log(n))
{
  sort(arr, arr + sz);
  for (int i = 0; i < sz; i++)
  {
    int complement = target - arr[i];
    if (binary_search(arr, arr + i, complement))
    {
      return true;
    }
  }

  return false;
}

bool twoSum_two_pointers(int *arr, int sz, int target) // O(n*Log(n))
{

  sort(arr, arr + sz);

  int left{0}, right{sz - 1};
  while (left < right)
  {
    int sum = arr[left] + arr[right];

    if (sum == target)
      return true;
    else if (sum < target)
      left++;
    else
      right--;
  }

  return false;
}

int main()
{
  int arr[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int target{};
  cin >> target;

  cout << twoSum_brute_force(arr, 10, target) << "\n";
  cout << twoSum_two_pointers(arr, 10, target) << "\n";
  cout << twoSum_binary_search(arr, 10, target) << "\n";

  return 0;
}