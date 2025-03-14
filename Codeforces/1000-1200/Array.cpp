/*
 * url: https://vjudge.net/solution/59174221/e5mxhsYwUVkLn5VzQxq8
 * date: 14 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 *
 * approach: given the problem conditions, I observed that we should group the numbers in the following way:
 * 1. all positive numbers in the second group
 * 2. all zeros in the third group
 * 3. all negative numbers in the negs group
 * then we have to insert at least one negative number to the first set
 * then we have to check if positive set contains at least one number, if not we have to insert two negative numbers to the second set, and we make sure we have these numbers from the problem constraints
 * finally, we have to insert all the remaining negative numbers to the zeros set i dealed with it as a garbage set
 */

#include <bits/stdc++.h>
using namespace std;

void pritn_solution(vector<int> &st)
{
  cout << st.size() << " ";

  for (const int &i : st)
    cout << i << " ";

  cout << "\n";
}

void solution()
{
  int n{};
  cin >> n;

  vector<int> st1, st2, st3, negs;
  for (int i = 0; i < n; i++)
  {
    int num{};
    cin >> num;

    if (num == 0)
      st3.push_back(0);
    else if (num > 0)
      st2.push_back(num);
    else
      negs.push_back(num);
  }

  st1.push_back(negs.back());
  negs.pop_back();

  if (st2.empty())
  {
    st2.push_back(negs.back());
    negs.pop_back();

    st2.push_back(negs.back());
    negs.pop_back();
  }

  if (!negs.empty())
  {
    st3.insert(st3.end(), negs.begin(), negs.end());
  }

  pritn_solution(st1);
  pritn_solution(st2);
  pritn_solution(st3);
}

int main()
{
  solution();
  return 0;
}