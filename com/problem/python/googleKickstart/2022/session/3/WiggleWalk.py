def main():
    T = int(input())  # the number of test cases

    for case in range(1, T+1):
        N, R, C, r, c = map(int, input().split())
        instructions = input()  # string of N, S, E or W
        seen = {(r, c)}

        for i in instructions:
            if i == 'N':
                r -= 1
                while (r, c) in seen:
                    r -= 1
            elif i == 'S':
                r += 1
                while (r, c) in seen:
                    r += 1
            elif i == 'E':
                c += 1
                while (r, c) in seen:
                    c += 1
            else:  # 'W'
                c -= 1
                while (r, c) in seen:
                    c -= 1
            seen.add((r, c))

        print('Case #{}: {} {}'.format(case, r, c))


main()
