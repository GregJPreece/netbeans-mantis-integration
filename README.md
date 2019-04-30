This Netbeans plugin integrates the Mantis bugtracker into the Netbeans IDE.

After installation a new issue tracker is available inside Netbeans.

# User information
## Relevant config options in MantisBT (server side):

- source_control_notes_view_status (default private, integer value 10 -> public)
- source_control_set_resolution_to (integer value 80->resolved, 90->closed)
- source_control_set_status_to (20->fixed)

## SSL-Handling

If your installation uses a regular SSL certificate, which is signed by a 
certificate authority (CA), that is part of the normal java certificate storage,
that is directly supported. Just enter the URL and with a https prefix.

If you use a self-signed certificate, there are two options:

1. Add your certificate to the java truststore:

        keytool -import -file <servercertfile> -alias <servername> -keystore "%JAVA_HOME%\lib\security\cacerts"

2. Make sure you use a recent version of MantisIntegration (0.5 and newer) and
install the "SSL Certificate Exception" module, that is part of nb-ldap-explorer.
The module can be found at: [http://code.google.com/p/nb-ldap-explorer/downloads/list](http://code.google.com/p/nb-ldap-explorer/downloads/list)
and is installable stand-alone. Since version 0.6 the "SSL Certificate Exception"
module is distributed together with the 7.4 modules inside the zip downloadable
from the netbeans plugin center.

# Developer information
## Pre-requisites (Temporary)

At the time of writing (April 2019) the nbm-maven-plugin has moved (along with the rest of Netbeans)
to the custody of the Apache project. At present, all of the Maven plugins are contained in
[https://github.com/apache/netbeans-mavenutils](a single repository) and are a pain to access directly. 
However, the latest version is required to fix [https://github.com/mojohaus/nbm-maven-plugin/issues/42](a compatibility issue)
with JDk9's module and package declarations. 

The new Maven Utils repository is in the process of [http://mail-archives.apache.org/mod_mbox/netbeans-dev/201904.mbox/%3C009e01d4fc48$1bf54250$53dfc6f0$@apache.org%3E](being broken up),
but until this work is complete you can build and install the plugin locally without much hassle.

Clone [https://github.com/apache/netbeans-mavenutils](https://github.com/apache/netbeans-mavenutils) 
to your local machine, then build and install the required Maven dependencies.

```
cd netbeans-mavenutils/parent/  
mvn install  
cd netbeans-mavenutils/netbeansparent/  
mvn install  
cd netbeans-mavenutils/nbm-shared/  
mvn install  
cd netbeans-mavenutils/nbm-maven-plugin/
mvn install  
```

With this in place, you can proceed to the regular (and much simpler) build instructions.

## Build Instructions:

1. Checkout the source code
2. build with maven (mvn package)