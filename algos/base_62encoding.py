

def base_62encoding(deci):
    str="1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    hash_str=""
    while deci >0 :
        hash_str=str[int(deci%62)]+hash_str
        deci/=62
    return hash_str

print(base_62encoding(999))


