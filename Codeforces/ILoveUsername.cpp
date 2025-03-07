/*
 * url1: https://vjudge.net/solution/58956449/qm0e33I01lA8pfRt7fTH
 * url2: https://vjudge.net/solution/58956543/O2hYMSgsvhuj00a1ij0X
 * date: 07 - 03 - 2025
 * category: implementation
 * complexity: O(n) / O(n * log(n))
 */

#include <bits/stdc++.h>
using namespace std;

void solution1() // O(n)
{
  int n{};
  cin >> n;

  int min_record{-1}, max_record{}, cnt{};
  while (n--)
  {
    int num{};
    cin >> num;

    if (min_record == -1)
    {
      min_record = num;
      max_record = num;
    }

    if (num < min_record)
    {
      min_record = num;
      cnt++;
    }
    else if (num > max_record)
    {
      max_record = num;
      cnt++;
    }
  }

  cout << cnt << "\n";
}

void solution2() // O(n log (n))
{
  int n{};
  cin >> n;

  int cnt{};
  priority_queue<int> max_records;
  priority_queue<int, vector<int>, greater<int>> min_records;

  while (n--)
  {
    int num{};
    cin >> num;

    if (max_records.size() == 0)
    {
      max_records.push(num);
      min_records.push(num);
      continue;
    }

    if (num < min_records.top())
    {
      min_records.push(num);
      cnt++;
    }
    else if (num > max_records.top())
    {
      max_records.push(num);
      cnt++;
    }
  }

  cout << cnt << "\n";
}

int main()
{

  solution2();

  return 0;
}