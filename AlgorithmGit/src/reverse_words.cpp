#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
int main() {
    string name = "Hello! my name is anand";
    int start,end;
    reverse(name.begin(), name.end());
    cout << name << endl;
    int i;
    for( i=0; i<name.size(); i++) {
        if ( name[i] != ' ') {
            start=i;
            break;
        }
    }
    for( ; i<name.size(); i++) {
        if ( name[i] == ' ' || i==name.size()-1) {
            end=i-1;
            if ( i == name.size() -1 ) end = i;
            cout << "from : " << name[start] << " to " << name[end] << endl;
            while ( start < end ) {
                char tmp = name[start];
                name[start++] = name[end];
                name[end--]=tmp;
            }
            while ( name[i] == ' ') i++;
            start = i;
        } else {
            ++end;
        }
    }
    cout << name << endl;
    return 0;
}
