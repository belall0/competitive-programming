/*
 * url: https://vjudge.net/solution/59206461/AcN2jW8U37bTvZOVsGMM
 * date: 15 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  int q{};
  cin >> q;

  deque<int> dq;
  bool isReversed{false};
  while (q--)
  {
    string operation{};
    cin >> operation;

    if (dq.empty() && (operation == "back" || operation == "front"))
    {
      cout << "No job for Ada?\n";
      continue;
    }

    if (operation == "reverse")
    {
      isReversed = !isReversed;
      continue;
    }

    if (operation == "back")
    {
      cout << (isReversed ? dq.front() : dq.back()) << "\n";
      isReversed ? dq.pop_front() : dq.pop_back();
    }
    else if (operation == "front")
    {
      cout << (isReversed ? dq.back() : dq.front()) << "\n";
      isReversed ? dq.pop_back() : dq.pop_front();
    }
    else if (operation == "push_back")
    {
      int num{};
      cin >> num;

      isReversed ? dq.push_front(num) : dq.push_back(num);
    }
    else if (operation == "toFront")
    {
      int num{};
      cin >> num;

      isReversed ? dq.push_back(num) : dq.push_front(num);
    }
  }
}

int main()
{
  solution();
  return 0;
}