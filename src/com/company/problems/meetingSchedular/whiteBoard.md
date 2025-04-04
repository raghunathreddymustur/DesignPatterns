#  Meeting Scheduler

# WhiteBoard

Identifying classes
----

MeetingScheduler
 - organizer
 - calender
 - rooms
 - bookMeeting()
 - cancelMeeting()
 - bookRoom()
 - releaseRoom()
 - checkRoomAvailability()


Meeting
 - id
 - meetingRoom
 - listOfUser
 - Interval
 - subject
 - addParticipants()

Interval
 - startTime
 - endTime

Participant/User
 - name
 - email
 - canRespondToNotification():void

ROOM
 - id
 - Capacity
 - availability
 - listOfBookings
 - location


Invite/Notification
 - id
 - content
 - creationDate
 - sendInvite(User)
 - cancelInvite(User)


Calender
 - listOfMeetings


Action
-----
scheduler - schedule,cancel and book a meeting for group of participants
Organizer - can add participants after meeting is scheduled
participant- can accept/reject the invite
