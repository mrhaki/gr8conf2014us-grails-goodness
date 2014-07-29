import gr8conf.us.User

class UserBootStrap {
	def init = { servletContext ->

		println User.findOrSaveByUsernameAndEmail('mrhaki', 'mrhaki@jdriven.com')
		println User.findOrSaveByUsernameAndEmail('hubert', 'hubert@mrhaki.com')
	}
}