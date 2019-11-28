class hashtable:


    def __init__(self):
        self.size=6
        self.map=[None] * self.size


    def get_hash_code(self,key):
        hash_code=0
        for char in str(key):
            hash_code+=ord(char)
        return hash_code%self.size

    def add(self,key,value):
        hash_code=self.get_hash_code(key)
        key_value=[key,value]
        if self.map[hash_code] is None:
            self.map[hash_code]=key_value
        else:
            for pair in self.map[hash_code]:
                if pair[0]==key:
                    pair[1]=value
                    return True
            self.map[hash_code].append(key_value)
            return True

    def get_data(self,key):
        hash_code=self.get_hash_code(key)
        if self.map[hash_code] is not None:
            for data in self.map[hash_code]:

                if data[0] == key:
                    print(data[0])
                    print("Key : " + str(key) +" : "+ data[1] + " found ")
                else :
                    print("Key : " + str(key) + " Not found ")

    def pprint(self):
        print("--- PHONE BOOK -- ")
        for item in self.map:
            if item is not None:
                print(str(item))

h=hashtable()

h.add("Ligaroba", "0710264903")
h.add("Robertligaye", "0281730738")
h.add("Ligayew", "4028101273")

#h.pprint()



h.get_data("Robertligaye")





