JAVASRC = Trips.java
CLASSES = Trips.class
EXEC = Trips
INPUT3 = listoffiles.txt
OUTPUT = trips.txt

${CLASSES}: ${JAVASRC}
	javac ${JAVASRC}
	java ${EXEC} ${OUTPUT}

clean:
	rm ${$EXEC}${CLASSES}

.PHONY: clean

