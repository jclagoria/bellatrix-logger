package ar.com.belatrix.loggin;

import java.util.logging.Level;

import ar.com.belatrix.loggin.handlers.ConsoleBellatrixHandler;
import ar.com.belatrix.loggin.handlers.DatabaseBellatrixHandler;
import ar.com.belatrix.loggin.handlers.FileBellatrixHandler;
import ar.com.belatrix.loggin.loggers.CustomLogger;
import ar.com.belatrix.loggin.properties.LoggerProperties;

public class MyLog {

	private LoggerProperties loggerProperties;

	public MyLog(LoggerProperties loggerProperties) {

		this.loggerProperties = loggerProperties;

	}

	public void notify(String messageText, String level) throws RuntimeException {
		notify(new MessageLog(messageText, level));
	}

	private void notify(MessageLog message) {

		if (message.getMessageText() == null || message.getMessageText().isEmpty()) {
			throw new RuntimeException("Message is Null");
		}
		if (!loggerProperties.isLogToConsole() && !loggerProperties.isLogToFile() && !loggerProperties.isLogToDataBase()) {
			throw new RuntimeException("Invalid configuration");
		}
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING]
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING]
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building logging-bellatrix 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-idea-plugin:2.2.1:clean (default-cli) @ logging-bellatrix ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.363 s
[INFO] Finished at: 2017-12-18T08:09:43-03:00
[INFO] Final Memory: 10M/240M
[INFO] ------------------------------------------------------------------------
jclagoria on lagoria in /mnt/work/dev/IdeaProject/bellatrix/logging-util
$ ls -last
total 128
 4 drwxr-xr-x 4 jclagoria users  4096 Dec 18 08:09 .
84 -rw-r--r-- 1 jclagoria users 85780 Dec 18 08:08 logging-util.iws
16 -rw-r--r-- 1 jclagoria users 15932 Dec 18 08:08 logging-util.ipr
 4 -rw-r--r-- 1 jclagoria users    47 Dec 18 08:06 .gitignore
 4 drwxr-xr-x 5 jclagoria users  4096 Dec 18 08:00 ..
 4 -rw-r--r-- 1 jclagoria users   531 Dec 18 07:59 README.md
 4 -rw-r--r-- 1 jclagoria users  1603 Dec 18 06:42 pom.xml
 4 drwxr-xr-x 2 jclagoria users  4096 Dec 18 04:32 .ideaDataSources
 4 drwxr-xr-x 4 jclagoria users  4096 Dec 12 12:04 src
jclagoria on lagoria in /mnt/work/dev/IdeaProject/bellatrix/logging-util
$ git init
Initialized empty Git repository in /mnt/work/dev/IdeaProject/bellatrix/logging-util/.git/
jclagoria on lagoria in /mnt/work/dev/IdeaProject/bellatrix/logging-util(17518d11h10m|master*)
$ git remote add origin https://github.com/jclagoria/logger-bellatrix.git
jclagoria on lagoria in /mnt/work/dev/IdeaProject/bellatrix/logging-util(17518d11h10m|master*)
$ mvn idea:idea
[INFO] Scanning for projects...
[WARNING]
[WARNING] Some problems were encountered while building the effective model for ar.com.belatrix.loggin:logging-bellatrix:jar:0.0.1-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 8, column 21
[WARNING]
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING]
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING]
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building logging-bellatrix 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] >>> maven-idea-plugin:2.2.1:idea (default-cli) > generate-resources @ logging-bellatrix >>>
[INFO]
[INFO] <<< maven-idea-plugin:2.2.1:idea (default-cli) < generate-resources @ logging-bellatrix <<<
[INFO]
[INFO]
[INFO] --- maven-idea-plugin:2.2.1:idea (default-cli) @ logging-bellatrix ---
Downloading: https://repo.maven.apache.org/maven2/org/mockito/mockito-all/1.10.19/mockito-all-1.10.19.pom
Downloaded: https://repo.maven.apache.org/maven2/org/mockito/mockito-all/1.10.19/mockito-all-1.10.19.pom (930 B at 494 B/s)
Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-io/1.3.2/commons-io-1.3.2.pom
Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-io/1.3.2/commons-io-1.3.2.pom (640 B at 2.0 kB/s)
[WARNING] While downloading org.apache.commons:commons-io:1.3.2
  This artifact has been relocated to commons-io:commons-io:1.3.2.
  https://issues.sonatype.org/browse/MVNCENTRAL-244


Downloading: https://repo.maven.apache.org/maven2/org/mockito/mockito-all/1.10.19/mockito-all-1.10.19.jar
Downloaded: https://repo.maven.apache.org/maven2/org/mockito/mockito-all/1.10.19/mockito-all-1.10.19.jar (1.2 MB at 688 kB/s)
[INFO] jdkName is not set, using [java version1.8.0_144] as default.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 4.683 s
[INFO] Finished at: 2017-12-18T08:10:39-03:00
[INFO] Final Memory: 14M/296M
[INFO] ------------------------------------------------------------------------
jclagoria on lagoria in /mnt/work/dev/IdeaProject/bellatrix/logging-util(17518d11h10m|master*)
$ git push -u origin master
error: src refspec master does not match any.
error: failed to push some refs to 'https://github.com/jclagoria/logger-bellatrix.git'
jclagoria on lagoria in /mnt/work/dev/IdeaProject/bellatrix/logging-util(17518d11h11m|master*)
$ git init
Reinitialized existing Git repository in /mnt/work/dev/IdeaProject/bellatrix/logging-util/.git/
jclagoria on lagoria in /mnt/work/dev/IdeaProject/bellatrix/logging-util(17518d11h12m|master*)
$ git remote add origin https://github.com/jclagoria/logger-bellatrix.git

		if ((!loggerProperties.isLevelError() && !loggerProperties.isLevelMessage() && !loggerProperties.isLevelWarnimg())) {
			throw new RuntimeException("Error or Warning or Message must be specified");
		}

		Level level = null;
		CustomLogger customLogger = new CustomLogger(false);

		if (loggerProperties.isLevelMessage()) {
			level = Level.INFO;
		} else if (loggerProperties.isLevelWarnimg()) {

			level = Level.WARNING;
		} else if (loggerProperties.isLevelError()) {
			level = Level.SEVERE;
		}

		customLogger.setMessageText(message.getMessageText());

		if (loggerProperties.isLogToConsole()) {
			new ConsoleBellatrixHandler(loggerProperties).log(level, customLogger);
		}
		
		if(loggerProperties.isLogToFile()) {
			new FileBellatrixHandler(loggerProperties).log(level, customLogger);
		}
		
		if(loggerProperties.isLogToDataBase()) {
			new DatabaseBellatrixHandler(loggerProperties).log(level, customLogger);
		}


	}

}
