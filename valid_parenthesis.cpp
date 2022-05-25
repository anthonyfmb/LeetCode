#include <string>

using namespace std;

class Solution {
public:
    bool isValid(string s) {
        char str[s.length() + 1] = s.toCharArray();

        S q
            tack s;
        for (int i = 0; i < s.length(); i++) {
            if (str[i] == '(') {
                s.push(')');
            }
            else if (str[i] == '{') {
                s.push('}');
            }
            else if (str[i] == '[') {
                s.push(']');
            }
            else {
                if (s.isEmpty() || s.top() != str[i]) {
                    return false;
                }
                s.pop();
            }
        }

        return true;
    }
};

