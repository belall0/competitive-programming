/*
 * url: https://vjudge.net/solution/59862832/Mr4H2XMEg3mrtoFiBzKa
 * date: 10 - 04 - 2025
 * category: implementation & data structures
 * complexity: O(n * log(n) )
 */

#include <bits/stdc++.h>
using namespace std;

void copy_deque_to_priority_queue(deque<int> &dq, priority_queue<int, vector<int>, greater<int>> &pq)
{
  for (const int i : dq)
    pq.push(i);

  dq.clear();
}

void solution()
{
  int n{};
  cin >> n;

  deque<int> dq;
  priority_queue<int, vector<int>, greater<int>> pq;

  while (n--)
  {
    int oper{};
    cin >> oper;

    if (oper == 1)
    {
      int num{};
      cin >> num;

      dq.push_back(num);
    }
    else if (oper == 2)
    {
      if (!pq.empty())
      {
        cout << pq.top() << "\n";
        pq.pop();
      }
      else
      {
        cout << dq.front() << "\n";
        dq.pop_front();
      }
    }
    else
    {
      copy_deque_to_priority_queue(dq, pq);
    }
  }
}

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  solution();

  return 0;
}
