import System.Environment

fido :: Int -> Int
fido 0 = 0
fido 1 = 1
fido 2 = 1
fido x = fido(x-1) + fido(x-2) +fido(x-3)