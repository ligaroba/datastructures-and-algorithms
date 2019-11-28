
import numpy as np
import pandas as pd
import io
import requests


train_url="https://amazonaws.com/istreet-questions-us-east-1/417582/train.csv"
test_data="https://amazonaws.com/istreet-questions-us-east-1/417582/test.csv"
#train_csv=requests.get(train_url).content
#test_data=requests.get(test_data).content
train_data = pd.read_csv(train_url)
test_data = pd.read_csv(test_data)

train_data.head()