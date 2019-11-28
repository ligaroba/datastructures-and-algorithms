
table={}
item_cost=[1000,200,50]
total_amunt=10000
num=100
cart={"cow":0,"pig":0,"chicken":0}

def mem(key,value):
    if table[key] in None:
        table[key]=value

#def anim_comb(item_cost,num,total_amt):
    #for i in range(1,100):
        #alen = len(item_cost)
        #key = str(item_cost[0]:

def get_no_of_animal(remAmnt,rem_no_animal,x):
    #x = no of chickens y: no of pigs
    y=[remAmnt,rem_no_animal]
    y=rem_no_animal-x
    z =int(remAmnt/(x * item_cost[2]))
    #z=

def rec_cal(item_cost):
     maxNoOfCows=int(total_amunt/item_cost[0])
     costOfCows=item_cost[0]
     print(costOfCows)
     print("No cows | Total cost cows | Rem Amt | No Anim rem | No pigs | cost of pigs | Total cost of pigs\
     | remAmntLPC | No Chickens |Total cost of Chicken|  totalAmils")

     for i in range(0,maxNoOfCows):
         if (i+1)!=10:
             noOfcows=i+1
             noOfRemAnimals=num - int(i + 1)
             totalCostCows=int(int(i+1)*item_cost[0])
             remAmtLessCowsCost=total_amunt-int(int(i+1)*item_cost[0])
             cost_Of_chicken = item_cost[2]
             no_of_Chikens = int(remAmtLessCowsCost / cost_Of_chicken)
             totalAmils = int(noOfcows) + int(no_of_Chikens)
             if totalAmils<100:
                         noOfPigs=int(remAmtLessCowsCost/item_cost[1])
                         costOfPig=item_cost[1]
                         total_cost_of_pigs=int(noOfPigs*cost_Of_chicken)
                         total_cost_of_chicken = int(no_of_Chikens * costOfPig)
                         remAmtLessPigsCost=int(remAmtLessCowsCost-total_cost_of_pigs)



                         print("   " + str(noOfcows)+"    | " + str(totalCostCows) + "  | " + str(remAmtLessCowsCost) \
                               + "  | " + str(noOfRemAnimals)+" | " + str(noOfPigs)+" | " + str(costOfPig) \
                               + " | " + str(total_cost_of_pigs)+ " | " + str(remAmtLessPigsCost) + " | "  \
                               + str(no_of_Chikens) + "| "+ str(total_cost_of_chicken)+ " | " + str(totalAmils)
                               )

print(rec_cal(item_cost))


