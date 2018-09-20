JAVASRC = Stoptimes.java
CLASSES = Stoptimes.class
EXEC = Stoptimes
INPUT3 = listoffiles.txt
OUTPUT = stop_times.txt

${CLASSES}: ${JAVASRC}
	javac ${JAVASRC}
	java ${EXEC} ${INPUT3} ${OUTPUT}

clean:
	rm ${$EXEC}${CLASSES}
