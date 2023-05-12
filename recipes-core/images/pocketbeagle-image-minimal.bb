SUMMARY = "A small pocketbeagle image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot"
IMAGE_INSTALL += "packagegroup-bootlinlabs-games"
IMAGE_INSTALL += "packagegroup-core-ssh-openssh"


IMAGE_INSTALL += " python3 bash"
IMAGE_FEATURES += "debug-tweaks"


inherit extrausers
EXTRA_USERS_PARAMS = "\
    usermod -p '\$5\$EElRlUHUg2rrXCRU\$FUdrDdiSc9IZCV6ed0WO4RXbZNpaFw5dG/btL5xBkV/' root; \
    useradd -p '\$5\$.sAFpf1z7JMiM1.r\$BNbmY9/zTrqdjefSFhhEsLQ8lHcFv.sBH8P8/J6TkY2' yakup; \
    groupadd developers; \
    userdel nobody; \
    groupdel nobody; \
    groupmod -g 1020 developers; \
    usermod -s /bin/sh yakup; \
    "



IMAGE_FSTYPES = "tar.xz ext3 wic.xz"

LICENSE = "MIT"

inherit core-image