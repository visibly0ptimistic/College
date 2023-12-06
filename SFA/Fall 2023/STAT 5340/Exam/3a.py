from scipy.stats import binom

# Parameters
n_trials = 5  # Number of contracts
p_A = 0.45  # Probability of A getting a contract

# Number of simulations
n_simulations = 100000

# Simulate the number of contracts A gets in each simulation
simulated_contracts_A = binom.rvs(n_trials, p_A, size=n_simulations)

# Calculate E[NA] (expected value of NA)
E_NA = simulated_contracts_A.mean()

# Calculate the probability of A getting the majority of the contracts
prob_majority_A = (simulated_contracts_A > 2).mean()

# Print the results
print(f"E[NA] = {E_NA}")
print(f"Probability of A getting the majority: {prob_majority_A}")
