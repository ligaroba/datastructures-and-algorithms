class HashMap():
    def __init__(self):
        self.size = 6
        self.map = [None] * self.size

    def _get_hash_code(self, key):
        hashc = 0
        for char in str(key):
            hashc += ord(char)
        return hashc % self.size

    def add(self, key, value):
        key_hash = self._get_hash_code(key)
        key_value = [key, value]

        if self.map[key_hash] is None:
            self.map[key_hash] = list([key_value])
            return True
        else:
            for pair in self.map[key_hash]:  # checking then updating the value of the key
                if pair[0] == key:
                    pair[1] = value
                    return True
            self.map[key_hash].append(key_value)  # Appending the new key to the list at that hash code
            return True

    def get(self, key):
        key_hash = self._get_hash_code(key)
        if self.map[key_hash] is not None:
            for pair in self.map[key_hash]:
                if pair[0] == key:
                    return pair[1]
        else:
            return None

    def delete(self, key):
        key_hash = self._get_hash_code(key)
        if self.map[key_hash] is None:
            return False
        for i in range(0, len(self.map[key_hash])):
            if self.map[key_hash][i][0] == key:
                self.map[key_hash].pop(i)
                return True

    def pprint(self):
        print("--- PHONE BOOK -- ")
        for item in self.map:
            if item is not None:
                print(str(item))


h = HashMap()
h.add("Ligaroba", "0710264903")
h.add("Robertligaye", "0281730738")
h.add("Ligayew", "4028101273")

h.pprint()
print("Ligaroba : " + h.get("Ligaroba"))
print(" deleted " + str(h.delete("Ligayew")))









