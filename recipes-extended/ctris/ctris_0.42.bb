# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

SRC_URI = "file:///home/yakup/yocto-labs/ctris-${PV}.tar.bz2"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

DEPENDS = "ncurses"
LDFLAGS:append = " -Wl,-hash-style=gnu"

do_configure () {
	# Specify any needed co nfigure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake CC="${CC}"  
}

do_install () {
	# This is a guess; additional arguments may be required
	install -d ${D}${bindir}
	install -m 0755 ctris ${D}${bindir}
}

