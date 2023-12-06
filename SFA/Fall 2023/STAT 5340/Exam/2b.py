import numpy as np

# Define number of simulations
n_simulations = 100000

# Define initial probabilities
p_low = 2/3
p_medium = 2/10
p_high = 2/15

# Error probabilities
error_low_to_medium = 0.002
error_low_to_high = 0.0001

error_medium_to_high = 0.05
error_medium_to_low = 0.003

error_high_to_medium = 0.04
error_high_to_low = 0.0005

# Simulate random breach attempts
breach_attempts = np.random.choice(['Low', 'Medium', 'High'], size=n_simulations, p=[p_low, p_medium, p_high])

# Initialize counters
classified_low = 0
classified_medium = 0
classified_high = 0

true_low = 0
true_medium = 0
true_high = 0

# Simulate classifications
for attempt in breach_attempts:
    if attempt == 'Low':
        classification = np.random.choice(['Low', 'Medium', 'High'], p=[1 - error_low_to_medium - error_low_to_high, error_low_to_medium, error_low_to_high])
    elif attempt == 'Medium':
        classification = np.random.choice(['Low', 'Medium', 'High'], p=[error_medium_to_low, 1 - error_medium_to_high - error_medium_to_low, error_medium_to_high])
    else:  # High
        classification = np.random.choice(['Low', 'Medium', 'High'], p=[error_high_to_low, error_high_to_medium, 1 - error_high_to_medium - error_high_to_low])
    
    # Update counters based on classification
    if classification == 'Low':
        classified_low += 1
        if attempt == 'Low':
            true_low += 1
    elif classification == 'Medium':
        classified_medium += 1
        if attempt == 'Medium':
            true_medium += 1
    else:  # High
        classified_high += 1
        if attempt == 'High':
            true_high += 1

# Calculate conditional probabilities
p_true_low_given_classified_low = true_low / classified_low
p_true_medium_given_classified_medium = true_medium / classified_medium
p_true_high_given_classified_high = true_high / classified_high

print(f"P[True Low | Classified Low] = {p_true_low_given_classified_low}")
print(f"P[True Medium | Classified Medium] = {p_true_medium_given_classified_medium}")
print(f"P[True High | Classified High] = {p_true_high_given_classified_high}")
