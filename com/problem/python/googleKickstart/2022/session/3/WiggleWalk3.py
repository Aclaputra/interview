T = int(input())

def get_nb(r,c,i,nb):
    if (r, c, i) in nb:
        return nb[(r,c,i)]

    if i == 'N': return (r-1,c)
    elif i == 'S': return (r+1,c)
    elif i == 'E': return (r,c+1)
    else: return (r,c-1) # 'W'

for case in range(1, T+1):
    N, R, C, r, c = map(int, input().split())
    walk = input()
    nb = {}

    for i in walk:
        north = get_nb(r,c,'N',nb)
        south = get_nb(r,c,'S',nb)
        east = get_nb(r,c,'E',nb)
        west = get_nb(r,c,'W',nb)

        nb[(*north,'S')] = south
        nb[(*south,'N')] = north
        nb[(*east,'W')] = west
        nb[(*west,'E')] = east

        r, c = get_nb(r,c,i,nb)
        print(nb)

    #print('Case #{}: {} {}'.format(case,r,c))


