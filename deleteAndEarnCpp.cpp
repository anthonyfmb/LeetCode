#include <map>
#include <iostream>

using namespace std;

class Solution {
public:
    map<int, int> order;
    map<int, int> memo;

    int deleteAndEarn(vector<int>& nums) {
        int max_number = 0;
        
        for (int num : nums) {
            order[num] = order[num] + num;
            max_number = max(max_number, num);
        }
        
        return findMax(max_number);
    }
    
    int findMax(int num) {
        if (num == 0) return 0;
        if (num == 1) return order[1];
        if (memo.count(num)) return (memo.find(num))->second;

        memo[num] = max(findMax(num - 1), findMax(num - 2) + order[num]);
        return (memo.find(num))->second;
    }
};
