# PasswordValidator
Project to validate password based on set criteria


Tests that a given password provided in say.in file are acceptable and produces an output file say.out containing the result. 

To be acceptable, a password must satisfy these three rules:

<li>It must contain at least one vowel.</li>
<li>It cannot contain three consecutive vowels or three consecutive consonants.</li>
<li>It cannot contain two consecutive occurrences of the same letter, except for 'ee' or 'oo'. </li>

The input consists of one or more potential passwords, one per line, followed by a line containing only the word 'end' that signals the end of the file. Each password is at least one and at most twenty letters long and consists only of lowercase letters. For each password, output whether or not it is acceptable.

<b>Example input: </b>

a
tv
ptoui
bontres
zoggax
wiinq
eep
houctuh
end


<b>Example output:

<a> is acceptable.
<tv> is not acceptable.
<ptoui> is not acceptable.
<bontres> is not acceptable.
<zoggax> is not acceptable.
<wiinq> is not acceptable.
<eep> is acceptable.
<houctuh> is acceptable.


<h2>Running the code:</h2>

Pleae run the PasswordValidator class as a starting point for executing the solution from any IDE.

