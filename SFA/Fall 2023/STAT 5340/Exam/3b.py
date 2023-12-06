import numpy as np
from scipy.stats import binom

# Number of remaining contracts to be awarded (since we know one went to A already)
n_remaining_contracts = 4

# Number of simulations
n_simulations = 100000

# Initialize counter for the number of new contracts awarded to A given the inside info
new_contracts_A_given_info = []

# Simulate the new process
for _ in range(n_simulations):
    # We already know one contract went to A
    contracts_A = 1
    
    # Simulate the remaining four contracts
    additional_contracts_A = binom.rvs(n_remaining_contracts, 0.45)
    
    # Total contracts for A given the inside info
    total_contracts_A = contracts_A + additional_contracts_A
    new_contracts_A_given_info.append(total_contracts_A)

# Convert to numpy array for easier manipulation
new_contracts_A_given_info = np.array(new_contracts_A_given_info)

# Calculate E[NA|Info]
E_NA_given_info = new_contracts_A_given_info.mean()

# Calculate the probability of A getting the majority of the contracts given the info
prob_majority_A_given_info = (new_contracts_A_given_info > 2).mean()

# Print the results
print(f"E[NA|Info] = {E_NA_given_info}")
print(f"Probability of A getting the majority given the info: {prob_majority_A_given_info}")
