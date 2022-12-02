case_num = {
    0: 0,
    1: 1,
    2: 1,
}
g = lambda f: case_num[f] if f <= 2 else g(f-1)+g(f-2)+g(f-3)
[g(n) for n in range(7)]


# [0, 1, 1, 2, 4, 7, 13]:




