 #include <iostream>
 using namespace std;
 
 int solve() {
    int n,m = (cin >> n >> m,n,m);
    int sum = 0;
    while(n--) {
        int c = (cin >> c,c);
        sum += c;
    }
    return sum % m;
 }
 
 int main() {
    int t = (cin >> t,t);
    for (int tt=1; tt<=t; tt++) 
        printf("Case #%d: %d\n",tt,solve());
    return 0;
 }
 
 