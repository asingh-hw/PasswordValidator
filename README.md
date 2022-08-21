# PasswordValidator
Project to validate password based on set criteria


Tests that a given password provided in say.in file are acceptable and produces an output file say.out containing the result. 

To be acceptable, a password must satisfy these three rules:

<li>It must contain at least one vowel.</li>
<li>It cannot contain three consecutive vowels or three consecutive consonants.</li>
<li>It cannot contain two consecutive occurrences of the same letter, except for 'ee' or 'oo'. </li>
<br>
<br>
<p>
The input consists of one or more potential passwords, one per line, followed by a line containing only the word 'end' that signals the end of the file. Each password is at least one and at most twenty letters long and consists only of lowercase letters. For each password, output whether or not it is acceptable.
</p><br>
<b>Example input: </b>
<br>
a <br>
tv <br>
ptoui <br>
bontres <br>
zoggax <br>
wiinq <br>
eep <br>
houctuh <br>
end <br><br>


<b>Example output:</b>
<br>
<a> is acceptable.<br>
<tv> is not acceptable.<br>
<ptoui> is not acceptable.<br>
<bontres> is not acceptable.<br>
<zoggax> is not acceptable.<br>
<wiinq> is not acceptable.<br>
<eep> is acceptable.<br>
<houctuh> is acceptable.<br>

<br>
<h2>Running the code:</h2><br>

Pleae run the PasswordValidator class as a starting point for executing the solution from any IDE.

