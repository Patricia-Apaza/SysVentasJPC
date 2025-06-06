package pe.edu.upeu.sysventasjpc.repository

import retrofit2.Response
import pe.edu.upeu.sysventasjpc.data.remote.RestUsuario
import pe.edu.upeu.sysventasjpc.modelo.UsuarioDto
import pe.edu.upeu.sysventasjpc.modelo.UsuarioResp
import javax.inject.Inject

interface UsuarioRepository {
    suspend fun loginUsuario(user: UsuarioDto):Response<UsuarioResp>
}
class UsuarioRepositoryImp @Inject constructor(private val restUsuario: RestUsuario):UsuarioRepository{
    override suspend fun loginUsuario(user:UsuarioDto):Response<UsuarioResp>{
        return restUsuario.login(user)
    }
}