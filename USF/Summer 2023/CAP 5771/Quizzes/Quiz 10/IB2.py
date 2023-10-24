import numpy as np

class IB1:
    def __init__(self):
        self.train_data = None
        self.train_labels = None

    def train(self, train_data, train_labels):
        self.train_data = train_data
        self.train_labels = train_labels

    def predict(self, test_data):
        predicted_labels = []
        for test_instance in test_data:
            distances = np.linalg.norm(self.train_data - test_instance, axis=1)
            nearest_neighbor_idx = np.argmin(distances)
            predicted_labels.append(self.train_labels[nearest_neighbor_idx])
        return predicted_labels

def main():
    # Given dataset
    dataset = np.array([[8, 25, 44], [11, 26, 59], [5, 23, 31], [15, 20, 81],
                       [2, 24, 22], [54, 28, 120], [1, 27, 5], [7, 21, 28]])
    data = dataset[:, :2]  # Extracting input features
    labels = dataset[:, 2]  # Extracting target labels

    # Shuffle the dataset randomly
    np.random.seed(42)  # For reproducibility
    np.random.shuffle(dataset)

    # Split the dataset into training and testing sets (50% for testing)
    split_idx = int(0.5 * len(dataset))
    train_data, train_labels = dataset[:split_idx, :2], dataset[:split_idx, 2]
    test_data, test_labels = dataset[split_idx:, :2], dataset[split_idx:, 2]

    # Create and train the IB1 classifier
    ib1 = IB1()
    ib1.train(train_data, train_labels)

    # Make predictions on the test data
    predicted_labels = ib1.predict(test_data)

    # Calculate the number of examples missed
    missed_examples = np.sum(predicted_labels != test_labels)

    # Calculate the accuracy
    accuracy = np.sum(predicted_labels == test_labels) / len(test_labels)

    # Calculate the range of possible accuracies for alpha = 0.05
    alpha = 0.05
    n = len(test_labels)
    p = accuracy
    z = 1.96  # Z-value for 95% confidence interval
    range_lower = p - z * np.sqrt((p * (1 - p)) / n)
    range_upper = p + z * np.sqrt((p * (1 - p)) / n)

    # Check if the accuracy result from the decision tree lies within the range
    decision_tree_accuracy = 0.75  # Replace with your own decision tree accuracy result
    in_range = (range_lower <= decision_tree_accuracy <= range_upper)

    # Print the results
    print("Number of examples missed:", missed_examples)
    print("Accuracy:", accuracy)
    print("Range of possible accuracies for alpha = 0.05:", range_lower, "-", range_upper)
    print("Does the decision tree accuracy lie in this range?", in_range)

if __name__ == "__main__":
    main()
