The management of a fast food store in Rockhampton has asked you to write a java program to help
calculating and recording the wage of its employees. This application should also produces some
statistics.

You are to write a Java Console Application (Pay.java) which will allow users to enter the details
of N employees including their name, skill level (which is defined as level 1, 2 and 3), and the number
of hours they work for a week. N should be equal to the highest digit in your student ID, use N=3 if
your highest digit is less than three. For each employee the program will prompt for accepting the
employee name, skill level and the length of worked hours (in whole number). It will then display the
wage that the employee should receive (see sample output below for formatting details). The standard
rates of wage depend on the skill levels, which are set as $15, $17 and $21 per hour for levels 1, 2,
and 3 respectively, while the employee will be paid at one and one-half times the usual rate for any
hours over 40. The wage is simply computed by multiplying the number of worked hours with the
hourly rate and you may account for the over-time pay if the employee works more than 40 hours.
The required Java Console Application should allow the user to:

1. Enter the name, skill level, and the length of worked hours (in whole number) for each of the N
employees. The program then will compute and output the wage for this employee. All dollar values
will be formatted to two decimal places (see implementation below with help for doing this). It
assumes that when the program is running, the user will correctly enter either 1, 2 or 3 for employee
skill level, no other digit entered. The program will number each employee in the input prompt.

2. Show relevant statistical information after N employees have been entered and related
computations have been completed. You will output a heading for the statistics “Statistical
information & bar chart”, the minimum and maximum wage with the corresponding name of the
employee, and the average wage (formatted to two decimal places. see sample output below) and
finally a simple bar chart to indicate how many employees to work in a specific length interval. Note:
if more than one employee has an equal maximum or minimum wage you just need to only output one
of the employee’s name.

3. Display a welcome message at the beginning “Welcome to use the General Wage Record System”
and an end message e.g. “Thank you for using the General Wage Record System” and the final line
“Program written by <your student ID>” (see sample output below).
The numeric literal values N, and the standard wage rates, etc. must be represented as constants.
