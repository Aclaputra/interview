def number_of_record_breaking_days(number_of_days, visitors):
    arr = list(map(int, input().split(" ")))
    res = 0
    p = 0
    n = len(arr)

    for j in range(number_of_days):
        gpd = j == 0 or visitors[j] > p;
        gnd = j == number_of_days - 1 or visitors[j] > visitors[j + 1]

        if (gpd and gnd):
            ++res
            continue

        p = max(p, visitors[j])

    return res

def main():
    test_cases = int(input().strip())
    for test_case in range(1, test_cases + 1):
        number_of_days = int(input().strip())
        visitors = list(map(int, input().split(" ")))
        number_of_days = len(visitors)

        ans = number_of_record_breaking_days(number_of_days, visitors)

        print("Case #{}: {}".format(test_case, ans))

if __name__ == "__main__":
    main()
