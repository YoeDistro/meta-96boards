DESCRIPTION = "A tool to read/write/update android boot images"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "util-linux"

SRCREV = "7e127fee6a3981f6b0a50ce9910267cd501e09d4"
SRC_URI = "git://gitorious.org/ac100/abootimg.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 abootimg ${D}${bindir}/
}

BBCLASSEXTEND = "native nativesdk"

