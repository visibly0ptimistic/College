import numpy as np

# Initialize counter for incorrect classifications
incorrect_classifications = 0

# Function to classify a single attempt
def classify_attempt(attempt):
    if attempt == 'Low':
        return np.random.choice(['Low', 'Medium', 'High'], p=[1 - error_low_to_medium - error_low_to_high, error_low_to_medium, error_low_to_high])
    elif attempt == 'Medium':
        return np.random.choice(['Low', 'Medium', 'High'], p=[error_medium_to_low, 1 - error_medium_to_high - error_medium_to_low, error_medium_to_high])
    else:  # High
        return np.random.choice(['Low', 'Medium', 'High'], p=[error_high_to_low, error_high_to_medium, 1 - error_high_to_medium - error_high_to_low])

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

# Simulate the new process for classifications
for attempt in np.random.choice(['Low', 'Medium', 'High'], size=n_simulations, p=[p_low, p_medium, p_high]):
    first_classification = classify_attempt(attempt)
    second_classification = classify_attempt(attempt)
    third_classification = classify_attempt(attempt)
    
    classifications = [first_classification, second_classification, third_classification]
    
    # Check for agreement among the first three classifications
    if classifications.count('Low') >= 2:
        final_classification = 'Low'
    elif classifications.count('Medium') >= 2:
        final_classification = 'Medium'
    elif classifications.count('High') >= 2:
        final_classification = 'High'
    else:
        # All three disagree, obtain a fourth classification
        fourth_classification = classify_attempt(attempt)
        final_classification = fourth_classification
    
    # Check for incorrect classification
    if final_classification != attempt:
        incorrect_classifications += 1

# Calculate the probability of incorrect classification
p_incorrect_new_process = incorrect_classifications / n_simulations

# Print the probability of incorrect classification
print(f"Probability of incorrect classification with new process: {p_incorrect_new_process}")


print(f"incorrect classification: {incorrect_classifications}")
