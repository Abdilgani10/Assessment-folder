# -*- mode: ruby -*-
# vi: set ft=ruby :


Vagrant.configure("2") do |config|

  config.vm.box = "chad-thompson/ubuntu-trusty64-gui"
  
  config.vm.hostname = "mymachine.gac.local"
  config.vm.synced_folder "shared", "/temp/shared"
  
  config.vm.provider "virtualbox" do |vb|
	vb.gui=false
	vb.memory = "2048"
	

end

 config.vm.define "machineA" do |machineA|
	machineA.vm.hostname = "machineMaster.gac.local"
	machineA.vm.network "public_network" , ip: "192.168.1.25"
	machineA.vm.provision "shell" ,path: "masterScript.sh"
	
end
 config.vm.define "machineB" do |machineB|
	machineB.vm.hostname = "machineAgent.gac.local"
	machineB.vm.network "public_network" , ip: "192.168.1.125"
	machineB.vm.provision "shell" ,path: "agentScript.sh"
	
end

end
