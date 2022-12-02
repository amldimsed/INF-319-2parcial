conjunto_ads :: Eq x => [x] -> [x] -> Bool
conjunto_ads xx yy = 
    [y | y <- xx, y `elem` yy] == xx