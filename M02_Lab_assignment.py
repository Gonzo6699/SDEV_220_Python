# Initialize lists to store student names and GPAs
student_names = []
student_gpas = []

while True:
    last_name = input("Enter the student's last name (or 'ZZZ' to quit): ").strip()

    if last_name == 'ZZZ':
        break

    first_name = input("Enter the student's first name: ")
    gpa = float(input("Enter the student's GPA: "))

    # Add student information to lists
    student_names.append((first_name, last_name))
    student_gpas.append(gpa)

# Test and print qualifications
for i in range(len(student_names)):
    first_name, last_name = student_names[i]
    gpa = student_gpas[i]

    if gpa >= 3.5:
        print(f"{first_name} {last_name} has made the Dean's List.")
    elif gpa >= 3.25:
        print(f"{first_name} {last_name} has made the Honor Roll.")
    else:
        print(f"{first_name} {last_name} does not qualify for any academic recognition.")