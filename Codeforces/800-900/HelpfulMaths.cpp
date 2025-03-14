/*
 * url: https://vjudge.net/solution/58924264/UpEpvk4RKVKsqPUkL552
 * date: 06 - 03 - 2025
 * category: implementation
 * complexity: O(nlogn)
 */

#include <bits/stdc++.h>
using namespace std;

int main()
{
  string str{};
  cin >> str;

  string nums{};
  for (int i = 0; i < str.length(); i += 2)
    nums += str[i];

  sort(nums.begin(), nums.end());

  for (int i = 0; i < nums.length(); i++)
    cout << nums[i] << "+\n"[i == nums.length() - 1];
  return 0;
}