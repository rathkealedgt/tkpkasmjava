#!/bin/bash
# This file can be downloaded by students in their Kasm Ubuntu container. The container should already
# have the eclipse IDE installed. Students may need to be shown how to chmod and execute the script.
mkdir ~/TKPSource
cd ~/TKPSource
wget -O master.zip https://github.com/rathkealedgt/tkpkasmjava/archive/refs/heads/main.zip
unzip master.zip
rm master.zip
mv tkpkasmjava-main tkp-kasm-java
cd tkp-kasm-java
unzip eclipse_workspace.zip
