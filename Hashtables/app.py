from Hashtables.hash_map_ds import HashMap

h=HashMap()
h.add("Ligaroba","0710264903")
h.add("Robertligaye","0281730738")
h.add("Ligayew", "4028101273")

h.print()
print("Ligaroba : " + h.get("Ligaroba"))
h.print(" deleted " + h.delete("Ligayew"))