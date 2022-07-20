from PyPDF2 import PdfReader

reader = PdfReader("modelgol.pdf")
fields = reader.get_form_text_fields()

#print(fields)

#fields = reader.get_fields()
print(fields)
