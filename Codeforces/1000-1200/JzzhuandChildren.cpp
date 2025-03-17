/*
 * url1: https://vjudge.net/solution/59244346/UxZ094YiDGW8VhvQS0nX
 * url2: https://vjudge.net/solution/59244771/EBPPSNZKZZ1wYgTddmM1
 * date: 16 - 03 - 2025
 * category: sorting, implementation
 * complexity: solution2 is O(n)
 */

#include <bits/stdc++.h>
using namespace std;

void solution1()
{
  int n{}, m{};
  cin >> n >> m;

  queue<pair<int, int>> q;
  for (int i = 1; i <= n; i++)
  {
    int num{};
    cin >> num;

    q.push({i, num});
  }

  int last_indx{-1};
  while (!q.empty())
  {
    pair<int, int> student = q.front();
    q.pop();

    if (student.second <= m)
    {
      last_indx = student.first;
    }
    else
    {
      student.second -= m;
      q.push(student);
    }
  }

  cout << last_indx << "\n";
}

struct set_compare_criteria
{
  bool operator()(const pair<int, int> &s1, const pair<int, int> &s2) const
  {
    if (s1.second > s2.second)
    {
      return true;
    }
    else if (s1.second < s2.second)
    {
      return false;
    }

    return s1.first > s2.first;
  }
};

void solution2()
{
  int n{}, m{};
  cin >> n >> m;

  set<pair<int, int>, set_compare_criteria> st;
  for (int i = 1; i <= n; i++)
  {
    double num{};
    cin >> num;

    int times = ceil(num / m);
    st.insert({i, times});
  }

  cout << (*st.begin()).first << "\n";
}

int main()
{
  solution2();
  return 0;
}