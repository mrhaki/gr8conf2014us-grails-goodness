import gr8conf.us.User

class UsersBootStrap {

    def init = { servletContext ->
    	println "UsersBootStrap"

    	println User.findOrCreateByUsernameAndEmail('mrhaki', 'mrhaki@jdriven.com').save()
    	println User.findOrCreateByUsernameAndEmail('hubert', 'hubert@mrhaki.com').save()
    }

    def destroy = {
    }
}
