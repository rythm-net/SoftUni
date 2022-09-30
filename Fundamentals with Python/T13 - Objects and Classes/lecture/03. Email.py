class Email:
    def __init__(self, sender, receiver, content):
        self.sender = sender
        self.receiver = receiver
        self.content = content
        self.is_sent = False

    def send(self):
        self.is_sent = True

    def get_info(self):
        return f"{self.sender} says to {self.receiver}: {self.content}. Sent: {self.is_sent}"

emails = []

while True:
    command = input()
    if command == "Stop":
        send_emails = input()
        send_emails = send_emails.split(", ")
        send_emails = [int(index) for index in send_emails]
        for x in send_emails:
            emails[x].send()
        break
    else:
        command = command.split(" ")
        sender = command[0]
        receiver = command[1]
        content = command[2]
        email = Email(sender, receiver, content)
        emails.append(email)

for email in emails:
    print(email.get_info())