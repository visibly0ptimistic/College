# Define the grading scale
grading_scale = {
    "A+": 4.0,
    "A": 4.0,
    "A-": 3.7,
    "B+": 3.3,
    "B": 3.0,
    "B-": 2.7,
    "C+": 2.3,
    "C": 2.0,
    "C-": 1.7,
    "D+": 1.3,
    "D": 1.0,
    "F": 0.0
}

# Define a list of courses
courses = [
    {
        "name": "Course 1",
        "credits": 3,
        "grade": "F"
    },
    {
        "name": "Course 2",
        "credits": 3,
        "grade": "B+"
    },
    {
        "name": "Course 3",
        "credits": 3,
        "grade": "A-"
    },
    {
        "name": "Course 4",
        "credits": 3,
        "grade": "B+"
    },
    {
        "name": "Course 5",
        "credits": 3,
        "grade": "A-"
    },
    {
        "name": "Course 6",
        "credits": 3,
        "grade": "B+"
    },
    {
        "name": "Course 7",
        "credits": 3,
        "grade": "A-"
    },
    {
        "name": "Course 8",
        "credits": 3,
        "grade": "B+"
    },
    {
        "name": "Course 9",
        "credits": 3,
        "grade": "A-"
    },
    {
        "name": "Course 10",
        "credits": 3,
        "grade": "B+"
    },
    {
        "name": "Course 11",
        "credits": 3,
        "grade": "A-"
    },
    {
        "name": "Course 12",
        "credits": 3,
        "grade": "B+"
    }
]


# Initialize variables for total credits and grade points
total_credits = 0
total_grade_points = 0

# Loop through each course and calculate the grade points
for course in courses:
    name = course["name"]
    credits = course["credits"]
    grade = course["grade"]
    
    # Convert the grade to a numerical value based on the grading scale
    if grade in grading_scale:
        grade_points = grading_scale[grade] * credits
        total_credits += credits
        total_grade_points += grade_points
    else:
        print(f"Invalid grade '{grade}' entered for {name}. Skipping...")

# Calculate the GPA
if total_credits > 0:
    gpa = total_grade_points / total_credits
    print(f"Your GPA is {gpa:.2f}")
else:
    print("No valid courses entered. Cannot calculate GPA.")
